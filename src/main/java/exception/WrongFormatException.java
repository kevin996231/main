package exception;

public abstract class WrongFormatException extends DukeException {
    public WrongFormatException(String message) {
        super(message + " You can type \"help\" to check the correct format");
    }
}
