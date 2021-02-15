package visitor;

public interface Staff {
    void PrintStructures();
    void Accept(IVisitor visitor);
    void Accept2(SVisitor visit);
}
