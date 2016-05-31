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
    clear() {
        console.log("Clearing fields");
    }
    execute() {
        console.log("execute()")
        console.log(this.selectedLanguage());
        console.log(this.stdinContent());
    }
}

export default { viewModel: HomeViewModel, template: homeTemplate };
