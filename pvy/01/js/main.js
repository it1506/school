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

function detailOfAnimal(data, id){
    var animal = {};
    try{
        if (isNaN(id)) throw "Argument is not a number";
        if (id < 0) throw "Cannot be less than zero";
        if(id > data.length -1) throw "cannot be greater than length of data file";
        var i = 0;
        while(i < data.length || !animal) {
            if(data[i].id == id) animal = data[i];
            i++;
        }
    }catch(err){
        return '<div>Error: '+ err +'</div>';
    }
    return animal;
}

console.log(detailOfAnimal(json,3));

$(function(){
    var animals = [];
    var animal = {};

    function listView(start, count){
        animals = listOfAnimals(json, start, count);
        animal = animals[0];
        $('#list').html('<div class="list-group"></div>');
        animals.forEach(function(item,index){
            $('#list .list-group').append('<a href="#" class="list-group-item">'+item.title+'</a>');
        });
        itemClick();
    }
    function detailView(animal){
        $('#detail').html('<h3>'+animal.title+' <small> '+ animal.latin_title +'</small></h3>');
    }
    function itemClick(){
        $('#list .list-group-item').on('click',function(){
           animal = detailOfAnimal(json,$(this).data('id'));
           detailView(animal);
        });
    }

    listView(0,10);
    detailView(animal);
})