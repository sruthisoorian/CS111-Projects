public class DonateToPaws
{
    public static double donationFee (double donationAmount)
    {
      if (donationAmount <= 150) //$150 and under
      {
        return 3.0;
      }
      else if (donationAmount < 1500)//bigger than $150 and less than $1500
      {
        if (donationAmount * 0.04 > 8)
        return donationAmount * 0.04;
        else
        return 8.0;
      }
      else if (donationAmount < 15000)//$1500 and larger, less than 15000
      {
        if (donationAmount * 0.01 > 20)
        return donationAmount * 0.01;
        else
        return 20;
      }
      else
      {
        if (donationAmount == 15000)
        {
          return 15000 * 0.01;
        }
        else if (donationAmount <= 19000)
        {
          return ((15000 * 0.01) + ((donationAmount - 15000) * 0.02));
        }
        else
        {
          return ((15000 * 0.01) + (4000 * 0.02) + ((donationAmount - 19000) * 0.03));
        }
      }
    }
}
