import React, { Component, Fragment } from 'react'

export default class User extends Component {
    constructor(props){
        super(props);
        this.state={
            chunks: [],
            isLoaded: false
        }
        this.Handler  = this.Handler.bind(this);
    }


    async componentDidMount(){
        try {

            var url = "http://localhost:5000/users";

            await fetch(url).then(res=> res.json()).then((item)=>{
                this.setState({
                    chunks: item
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

    async Handler(){
        try {

            this.setState({
                isLoaded: true
            })
            
        } catch (error) {
            console.log("Error Occured");
            
        }
    }


    render() {
       
        if(this.state.isLoaded == false){
            return(
                <div>
                  <div className="jumbotron text-center">
                      <h1> Please login </h1>
                      
                  <form onSubmit={this.Handler} >
                  <button className="text-center mx-auto" type="submit" className="btn btn-primary">Procceed</button>

                  </form>
                  </div>

                </div>
            )
        }else{
            return(
               <Fragment>

               <div className="container">
                   <h1> List of users</h1>
                   <br/>

                   <div className="">
                       {this.state.chunks.map((item)=>{
                           return <div className="" style={{marginTop : '70px'}}>
                               <h1>{item.email}</h1>
                               <h2>{item.firstname}</h2>
                               
                               
                           </div>;
                       })}
                   </div>
                   </div>
               </Fragment>
            )
        }
    }
}
