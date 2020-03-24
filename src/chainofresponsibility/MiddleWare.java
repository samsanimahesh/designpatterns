package chainofresponsibility;

public abstract class MiddleWare {
    private MiddleWare next;

    /**
     * Builds chains of middleware objects.
     */
    public MiddleWare linkWith(MiddleWare next) {
        this.next = next;
        return next;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     */
    public abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
