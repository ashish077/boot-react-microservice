import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import App from "./App";
import * as serviceWorker from "./serviceWorker";
import StudentTable from "./Components/StudentTable";
import BookPage from "./Components/BookPage";
import {
  BrowserRouter as Router,
  Link,
  Route,
  Switch,
  withRouter,
} from "react-router-dom";

ReactDOM.render(
  <Router>
    <div>
      <Switch>
        <Route exact path="/" exact component={App}></Route>
        <Route exact path="/books/:id" exact component={BookPage}></Route>
      </Switch>
    </div>
  </Router>,
  document.getElementById("root")
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
