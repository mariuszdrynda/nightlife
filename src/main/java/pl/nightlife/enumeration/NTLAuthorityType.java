package pl.nightlife.enumeration;

public enum NTLAuthorityType
{
    ROLE_PLACE("ROLE_PLACE"), ROLE_CUSTOMER("ROLE_CUSTOMER");

    private String role;

    NTLAuthorityType(String role)
    {
        this.role = role;
    }

    public String getRole()
    {
        return role;
    }
}
