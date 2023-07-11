import java.util.Arrays;
import java.util.List;

public class House
{
    private int floorsNumber;
    private String address;
    private List<String> residentsNames;

    public int getFloorsNumber()
    {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber)
    {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public List<String> getResidentsNames()
    {
        return residentsNames;
    }

    public void setResidentsNames(String residents)
    {
        this.residentsNames = Arrays.asList(residents.split(","));
    }
}
