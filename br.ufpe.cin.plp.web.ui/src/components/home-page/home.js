import ko from 'knockout';
import homeTemplate from 'text!./home.html';

class HomeViewModel {

    constructor(route) {
        this.selectedLanguage = ko.observable();
        this.stdinContent = ko.observable();
    }
    updateEditor(data, event) {
        // TODO: update to load dynamically the syntax highlight
    }
    toggleStdin() {
        $("#stdin").toggle("slow");
    }
    clear() {
        this.stdinContent("");
        $("#stdout-list").children().remove();
        // TODO clear editor content
    }
    execute() {
        var content = "1+2"; //textarea text
        $.ajax({
            type: "GET",
            url: "/compile",
            dataType: 'JSON',
            data: {
                language: this.selectedLanguage(),
                input: this.stdinContent(),
                source: content
            }
        }).done(function(data) {
            // Update console
            $("#stdout-list").append("<li>" + data.output + "</li>");
        });
    }
}

export default { viewModel: HomeViewModel, template: homeTemplate };
