import{ useState }from "react";
import "./app.css"
export default function Form(){
  
    const[name,setName]=useState("")
    const[email,setEmail]=useState("")
    const[password,setPassword]=useState("")
    const[submitted,setSubmitted]=useState(false)
  
    const handleName =(e)=>{
      setName(e.target.value);
    };
    const handleEmail=(e)=>{
      setEmail(e.target.value);
    };
    const handlePassword=(e)=>{
      setPassword(e.target.value);
    };
    const handleSubmitted=(e)=>{
      e.preventDefault();
      if(name===""||email===""||password===""){
        alert("enter the all the fields");
      }
      else{    
        setSubmitted(true);
      }
    };
    const successMeassage=()=>{
        if(submitted)
      return(
        <div className="sucess">
          <h1>user {name} sucessfully registered</h1>
        </div>
      );
    }
    return(
      <div className="form">
        <div>
          <h1>user registration</h1>
        </div>
        <div className="messages">
        {successMeassage()}
        </div>
        <form>
          <label>name</label>
          <input type="text" onChange={handleName}/>
          <label>Email</label>
          <input type="email" onChange={handleEmail}/>
          <label>password</label>
          <input type="password" onChange={handlePassword}/>
          <input type="submit" value="submit" onClick={handleSubmitted}/>
        </form>
      </div>
    );
  }
