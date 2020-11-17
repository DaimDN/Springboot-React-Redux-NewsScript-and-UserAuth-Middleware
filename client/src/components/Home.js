import React, { Component, Fragment } from 'react'
import ReactDOM from 'react-dom';

export default class Home extends Component {
   
    constructor(props){
        super(props);
        this.state = {
            array: [],
            chunks: []
        }
    }

  
    async componentDidMount(){
        try {

            var url = "http://localhost:5000/";

            await fetch(url).then(res=> res.json()).then((item)=>{
                this.setState({
                    chunks: item.msg
                })
                console.log(item);
            })
            
        } catch (error) {
            var array = [];
            array += "Error found";
            this.setState({
                chunks: array
            })
            console.log(error);
            
        }
    }

    render() {
        return (
           <Fragment>
               <div className="jumbotron">
                   <h1>
                 {this.state.chunks}

                   </h1>
               </div>
           </Fragment>
        )
    }
}

