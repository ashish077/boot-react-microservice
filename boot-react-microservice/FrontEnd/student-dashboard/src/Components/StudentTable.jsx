import React from "react";
import axios from "axios";
import { Link, withRouter } from "react-router-dom";

class StudentTable extends React.Component {
  constructor(props) {
    super(props);

    console.log("before state");

    this.state = {
      abc: [],
      selected: "",
    };
    console.log("inside constructor");
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  componentDidMount() {
    console.log("inside cmd");
    axios
      .get("http://localhost:8881/api/showstudents")
      .then((res) => {
        console.log(res.data);
        this.setState({ abc: res.data });
        console.log(this.abc.data);
      })
      .catch(function (error) {
        console.log(error);
      });
  }

  handleSubmit = (id) => {
    var y = this.state.selected;
    var PATH = "/books/" + y;
    console.log(PATH);
    this.props.history.push(`/books/${id}`);
    console.log(this.props.history);
  };

  render() {
    return (
      <div>
        <table className="table table-striped">
          <thead>
            <tr>
              <th>stuent-id</th>
              <th>first-name</th>
              <th>last-name</th>
              <th>email</th>
              <th>book-read</th>
            </tr>
          </thead>
          <tbody>
            {this.state.abc.map((items) => {
              return (
                <tr key={items.id}>
                  <td>{items.id}</td>
                  <td>{items.firstName}</td>
                  <td>{items.lastName}</td>
                  <td>{items.email}</td>
                  <td>
                    <button
                      className="btn btn-primary"
                      onClick={() => {
                        this.handleSubmit(items.id);
                      }}
                    >
                      books
                    </button>
                  </td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    );
  }
}

export default withRouter(StudentTable);
