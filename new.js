var str = "abcd";
var new_str = [];
gs(str,new_str,0);


function gs(str,new_str,index){
    if (new_str.length != 0){
        console.log(new_str.join(""));
    }
    if (index == str.length){
        return;
    }
    for (var i = index;i<str.length;i++){
        new_str.push(str[i]);
        gs(str,new_str,i+1);
        new_str.pop();
    }
}
