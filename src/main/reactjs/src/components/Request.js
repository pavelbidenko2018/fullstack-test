import axios from "axios";
import React, { Component } from "react";

class Request extends Component {
  constructor(props) {
    super(props);
    this.state = { name: "TEST" };
  }

  render() {
    return (
      <div className="hello">
        {this.state.name}
        <button onClick={this.getName}>Click</button>
      </div>
    );
  }

  getName = async () => {
    const res = await axios.get("http://localhost:8080/name");
    const data = await res.data;

    this.setState({ name: data });
  };
}

export default Request;
