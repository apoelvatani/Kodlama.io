using GameDemo.Abstract;
using GameDemo.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace GameDemo.Concrete
{
    public class SalesManager : ISalesService
    {
        ICampaignService _campaignService;

        public SalesManager(ICampaignService campaignService)
        {
            _campaignService = campaignService;
        }

        public void Sell(Gamer gamer, Product product)
        {
            _campaignService.ToCampaign(product);
            Console.WriteLine(gamer.FirstName + " adlı kullanıcıya " + product.Name + " adlı oyun " + product.Price + " fiyatına satıldı.");
        }
    }
}
