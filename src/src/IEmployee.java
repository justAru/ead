package src;

public interface IEmployee {
    void PrintStructures();
    void Accept(IVisitor visitor);
}
