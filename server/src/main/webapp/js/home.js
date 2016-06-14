function execute() {
	var lin = $("#lang-selector option:selected").val();
	var aux = editor.getValue();
	var padrao = $("#stdin-input").val();

	var ul = document.getElementById("stdout");
	var li = document.createElement("ul");
	li.appendChild(document.createTextNode("> "));
	ul.appendChild(li);

	$.ajax({
		type : "GET",
		url : "/compile",
		dataType : 'JSON',
		data : {
			language : lin,
			input : padrao,
			source : aux
		}
	}).done(function(data) {
		// Update console
		li.appendChild(document.createTextNode(data.output));
		ul.appendChild(li);
	})
}

function limpar() {
	$("#stdout").children().remove();
	$("#stdin-input").val("");
	editor.setValue("");
}

function slow() {
	$("#stdin").toggle("slow");
}

function getLinguagem(sel) {
	if ($('#lang-selector').val() == 'exp1') {
		setLanguage("text/exp1");
	}
	if ($('#lang-selector').val() == 'exp2') {
		setLanguage("text/exp2");
	}
	if ($('#lang-selector').val() == 'func1') {
		setLanguage("text/func1");
	}
	if ($('#lang-selector').val() == 'func2') {
		setLanguage("text/func2");
	}
	if ($('#lang-selector').val() == 'func3') {
		setLanguage("text/func3");
	}
	if ($('#lang-selector').val() == 'imp1') {
		setLanguage("text/imp1");
	}
	if ($('#lang-selector').val() == 'imp2') {
		setLanguage("text/imp2");
	}
	if ($('#lang-selector').val() == 'oo1') {
		setLanguage("text/oo1");
	}
	if ($('#lang-selector').val() == 'oo2') {
		setLanguage("text/oo2");
	}
}

function setLanguage(language){
	var editor = $('.CodeMirror')[0].CodeMirror;
	editor.setOption("mode", language);
	editor.setOption({"Ctrl-Space": "autocomplete"});

}