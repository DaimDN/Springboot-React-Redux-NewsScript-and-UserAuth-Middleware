import React, { Component } from 'react'
import {Switch, BrowserRouter as Router, Route } from 'react-router-dom';
import Home from '../components/Home';
import User from '../components/User';




 function contact(){
    return(
        <div>
            <h1> Contact me</h1>
        </div>
    )
}

function FourOfour(){
    return(
        <div>
            <h1>404 not found error</h1>
        </div>
    )

}


export default class Routing extends Component {
    render() {
        return (
           <Router>

               <Switch>
                    <Route exact path="/" component={Home} />
                    <Route exact path="/user" component={User} />
                   <Route exact path="/contact" component={contact} />
                    <Route exact path="*"  component={FourOfour}/>
               </Switch>
           </Router>
        )
    }
}


