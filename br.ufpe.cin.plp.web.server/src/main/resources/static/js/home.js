function execute() {
	var lin = $("#lang-selector option:selected").val();
	var aux = editor.getValue();
	var padrao = $("#stdin-input").val();
	var output = $("#stdout-list")
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
		output.append("<li>" + data.output + "</li>")
	})
}

function limpar() {
	$("#stdout-list").children().remove();
	$("#stdin-input").val("");
	editor.setValue("");
}

function showStdin() {
	$("#stdin").toggle("slow");
}

function getLinguagem(sel) {
	var linguagens = {
		'exp1': "text/exp1",
		'exp2': "text/exp2",
		'func1': "text/func1",
		'func2': "text/func2",
		'func3': "text/func3",
		'imp1': "text/imp1",
		'imp2': "text/imp2",
		'oo1': "text/oo1",
		'oo2': "text/oo2"
	};
	var linguagem = linguagens[$('#lang-selector').val()];

	if (linguagem) {
		setLanguage(linguagem);
	}
}

function setLanguage(language){
	var editor = $('.CodeMirror')[0].CodeMirror;
	editor.setOption("mode", language);
	editor.setOption({"Ctrl-Space": "autocomplete"});
}
