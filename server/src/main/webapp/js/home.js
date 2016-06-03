function execute() {
					//pegando a linguagem selecionada
					var lin = $("#lang-selector option:selected").val();
					//pegando o texto do editor
					var aux = editor.getValue();
					//pegando o valor da entrada padrão
					var padrao = $("#stdin-input").val();
					
					var ul = document.getElementById("stdout");
					var li = document.createElement("ul");
					li.appendChild(document.createTextNode("> "));
					ul.appendChild(li);
					
					$.ajax({
			            type: "GET",
			            url: "/compile",
			            dataType: 'JSON',
			            data: {
			                language: lin,
			                input: padrao,
			                source: aux
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