class SecureDocument {
    private String content;
    private String owner;
    private String accessToken;

    public SecureDocument(String owner, String content) {
        this.owner = owner;
        this.content = content;
        this.accessToken = generateToken();
    }

    private String generateToken() {
        return owner.hashCode() + "_" + System.nanoTime();
    }

    public String requestAccess(String user, String role) {
        if (role.equals("admin") || user.equals(owner)) {
            return accessToken;
        } else {
            return "ACCESS DENIED";
        }
    }

    public String viewContent(String token) {
        if (this.accessToken.equals(token)) {
            return content;
        } else {
            return "Unauthorized Access";
        }
    }

    public void updateContent(String token, String newContent) {
        if (this.accessToken.equals(token)) {
            this.content = newContent;
        } else {
            System.out.println("Unauthorized update attempt");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        SecureDocument doc = new SecureDocument("Alice", "Top Secret Code");

        String token = doc.requestAccess("Bob", "user");
        System.out.println("Access attempt: " + token);

        String adminToken = doc.requestAccess("Charlie", "admin");
        System.out.println("Admin Access Token: " + adminToken);

        System.out.println("Content: " + doc.viewContent(adminToken));
        doc.updateContent(adminToken, "Updated Secret Code");
        System.out.println("Updated Content: " + doc.viewContent(adminToken));
    }
}
