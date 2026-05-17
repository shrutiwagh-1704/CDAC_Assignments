const btn = document.getElementById("btn");
const formdata =document.getElementById("formdata");





btn.addEventListener("click", () => {
  
    
    const output1 = document.createElement("div");

    const FirstName = document.getElementById("firstname").value;
    const LastName = document.getElementById("LastName").value;
    const contactno = document.getElementById("contactNo").value;
    const email = document.getElementById("emailID").value;

    // console.log(FirstName);

    const p1= document.createElement("p");
const p2= document.createElement("p");
const p3= document.createElement("p");
const p4= document.createElement("p");

    p1.innerHTML=FirstName;
    p2.innerHTML = LastName;
    p3.innerHTML = contactno;
    p4.innerHTML = email;

    output1.appendChild(p1);
    output1.appendChild(p2);
    output1.appendChild(p3);
    output1.appendChild(p4);



    output1.classList.add("output");
    // output.innerText = "Hello";
    console.log("hello");
    

   formdata.appendChild(output1);
});