package seedu.duke.command;

import seedu.duke.Module;
import seedu.duke.data.Data;
import seedu.duke.ui.Ui;

public class ListModuleStudentsCommand extends Command {

    public String moduleCode;

    public ListModuleStudentsCommand(String moduleCode) {
        this.moduleCode = moduleCode;
        assert this.moduleCode != null : "Module code cannot be null";
    }

    public void execute(Data data, Ui ui) {
        Module module = data.find(moduleCode);
        ui.listModuleStudents(module);
    }
}
