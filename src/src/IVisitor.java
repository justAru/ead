package src;

public interface IVisitor {
    void VisitCompositeElement(CompositeEmployee employees);
    void VisitLeafNode(Employee employee);
}
