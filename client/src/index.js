import React, { Component } from 'react'
import ReactDOM from 'react-dom';

class Index extends Component {
   
    constructor(props){
        super(props);
        this.state = {
            array: []
        }
    }

    async componentDidMount(){

        try {

             await fetch("http://localhost:5000/api/v1").then(res=> res.json()).then(
                (item)=>{
                    this.setState({
                        array: item
                    })
                }
            )

        } catch (error) {
            console.log(error);
            
        }


    
    }
    render() {
        return (
            <div>
           hrfeuiuiehis
                
            </div>
        )
    }
}


ReactDOM.render(<Index/>, document.getElementById('root'));