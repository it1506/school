function listOfAnimals(data, start, count){
    try { 
        if(isNaN(start) || isNaN(count)) throw "not a number";
        if(start < 0) throw "cannot be less than zero";
        if(start > data.length -1) throw "cannot be greater than length of data file";
        if(start+count > data.length -1) throw "cannot be greater than length of data file";
    }
    catch(err) {
        return "<div>Error: " + err + "</div>";
    }
    var list = [];
    for(var i = start; i < count + start; i++){
        list.push(data[i]);
    }
    return (list.length > 0) ? list : '<p>No items</p>';
}

console.log(listOfAnimals(json,5,0));