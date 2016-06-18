(function() {
	"use strict";

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

	var editor = CodeMirror.fromTextArea(document.getElementById("code"), {
		lineNumbers: true,
		matchBrackets: true,
		mode: "text/exp1",
		extraKeys: {
			"Ctrl-Space": "autocomplete"
		}
	});

	$("#executar-btn").click(function() {
		var lin = $("#lang-selector option:selected").val();
		var aux = editor.getValue();
		var padrao = $("#stdin-input").val();
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
			$("#stdout-list").append("<li>" + data.output + "</li>")
		});
	});

	$("#mostrar-btn").click(function() {
		$("#stdin").toggle("slow");
	});

	$("#limpar-btn").click(function() {
		$("#stdout-list").children().remove();
		$("#stdin-input").val("");
		editor.setValue("");
	});

	$("#lang-selector").change(function() {
		var lingSelectionada = linguagens[$('#lang-selector').val()];
		if (lingSelectionada) {
			editor.setOption("mode", lingSelectionada);
			editor.setOption({"Ctrl-Space": "autocomplete"});
		}
	});

})();
