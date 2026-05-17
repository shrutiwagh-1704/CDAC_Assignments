const para1 = document.getElementById("para1");

// para1.style.color="red";
var oneclick=true;
function handleclick()
{
    if(oneclick===true)
    {
        para1.style.color="red";
        para1.style. fontSize="35px";
        para1.style.fontFamily="'Segoe UI', Tahoma, Geneva, Verdana, sans-serif";
        oneclick=false;
    }

    
    else
    {
        para1.style.color="black";
        para1.style.fontFamily = "'Times New Roman', Times, serif";
        para1.style. fontSize="25px";
        oneclick=true;

    }
   
}
