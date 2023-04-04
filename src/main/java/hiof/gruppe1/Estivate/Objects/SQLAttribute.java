package hiof.gruppe1.Estivate.Objects;

public class SQLAttribute {
    private Object object;
    private Class objectClass;
    public SQLAttribute(Class objectClass, Object object) {
        this.object = object;
        this.objectClass = objectClass;
    }

    @SuppressWarnings("unchecked")
    public <T> T getData() {
        return (T) objectClass.cast(object);
    }
    public <T> T getDataCast(Class<T> typeToCast) {
        return (T) typeToCast.cast(object);
    }
    public String getInnerClass() {
        // getClass will simply defer to the general object class, so we need to use toString and format it ourselves.
        String parsePath = object.toString();
        String[] parts = parsePath.split("\\.");
        return parts[parts.length-1];
    }
}
