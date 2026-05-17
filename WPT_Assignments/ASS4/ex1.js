var str="shruti";

function processData(str,uppercase)
{
     str=uppercase(str);
    console.log(str);
}

function uppercase(str)
{
    const strnew=str.toUpperCase();
    return strnew;
}

processData(str,uppercase);