public interface IVersionControl {

    void commit(String message);
    void pull();
    void push();
}
