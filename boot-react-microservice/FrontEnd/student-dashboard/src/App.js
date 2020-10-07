import React from "react";
import logo from "./logo.svg";
import "./App.css";
import StudentTable from "./Components/StudentTable";

function App() {
  return (
    <div>
      <header>
        <h1 className="center">Student Dashboard</h1>
      </header>
      <div>
        <StudentTable />
      </div>
    </div>
  );
}

export default App;
