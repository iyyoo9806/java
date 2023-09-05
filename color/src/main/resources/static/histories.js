$(function(){
	$.ajax({
		'url': 'history',
		'type': 'get',
		'success': function(data) {
			for (let i = 0; i < data.length; i++ ) {
				let row = data[i];
				let tr = $('<tr>');
				tr.append('<td>' + row['code'] + '</td>');
				tr.append('<td>' + '&nbsp;&nbsp;&nbsp;' + '</td>');
				tr.append('<td>' + row['created'] + '</td>');
				$('#list tbody').append(tr);
			}
		}
	});
});
