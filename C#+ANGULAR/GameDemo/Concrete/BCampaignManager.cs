using GameDemo.Abstract;
using GameDemo.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace GameDemo.Concrete
{
    // %50 kampanya uygular.
    public class BCampaignManager : ICampaignService
    {
        public void ToCampaign(Product product)
        {
            product.Price /= 2;
            Console.WriteLine(product.Name + " adlı oyuna %50 kampanya uygulandı.");
        }
    }
}
