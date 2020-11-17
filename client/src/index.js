import React, { Component, Fragment } from 'react'
import ReactDOM from 'react-dom';
import Routing from './Routing/Routing';

function Runner(){
    
    return(
        <Routing/>
    )
    

}

ReactDOM.render(<Runner/>, document.getElementById('root'));