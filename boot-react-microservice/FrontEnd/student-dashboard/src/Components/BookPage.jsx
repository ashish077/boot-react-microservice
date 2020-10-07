import React, { Component, useContext } from "react";
import axios from "axios";

class BookPage extends Component {
  constructor(props) {
    super(props);
    this.state = {
      books: [],
      stud: [],
    };
  }

  componentDidMount() {
    axios
      .get(`http://localhost:8882/api/book` + `/` + this.props.match.params.id)
      .then((res) => {
        console.log(res.data);
        this.setState({ books: res.data });
      });
  }

  render() {
    console.log(this.props);
    return (
      <div className="container">
        <div className="jumbotron">
          {/* <div className="header">
            <span>Name:</span>
            <span>
              {this.state.stud.firstName + " " + this.state.stud.lastName}
            </span>
          </div>
          <div className="header">
            <span>Email:</span>
            <span>{this.state.stud.email}</span>
          </div> */}
          <h1 className="center">Books Read</h1>
        </div>
        <table className="table table-striped">
          <thead>
            <th>Books-id</th>
            <th>Books-name</th>
            <th>Author</th>
          </thead>
          <tbody>
            {this.state.books.map((book) => {
              return (
                <tr key={book.bookId}>
                  <td>{book.bookId}</td>
                  <td>{book.bookName}</td>
                  <td>{book.author}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    );
  }
}

export default BookPage;
