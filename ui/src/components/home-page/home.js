import ko from 'knockout';
import homeTemplate from 'text!./home.html';

class HomeViewModel {
    constructor(route) {
        this.selectedLanguage = ko.observable();
    }
    updateEditor(data, event) {
        // TODO: update to dynamically loading syntax highlight
    }
    clear() {
        console.log("Clearing fields");
    }
    execute() {
        console.log(this.selectedLanguage());
    }
}

export default { viewModel: HomeViewModel, template: homeTemplate };
