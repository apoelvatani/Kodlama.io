using GameDemo.Abstract;
using GameDemo.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace GameDemo.Concrete
{
    // %25 kampanya uygular
    public class ACampaignManager : ICampaignService
    {
        public void ToCampaign(Product product)
        {
            product.Price *= 3;
            product.Price /= 4;
            Console.WriteLine(product.Name + " adlı oyuna %25 kampanya uygulandı.");
        }
    }
}
