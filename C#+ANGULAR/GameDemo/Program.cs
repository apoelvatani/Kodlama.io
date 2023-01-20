using GameDemo.Abstract;
using GameDemo.Adapters;
using GameDemo.Concrete;
using GameDemo.Entities;
using System;

namespace GameDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            GamerManager gamerManager = new GamerManager(new GamerCheckManager());
            Gamer gamer = new Gamer { DateOfBirth = new DateTime(1999, 4, 29), FirstName = "Mahmud", LastName = "Serdar", NationalityId = 123 };
            gamerManager.Save(gamer);
            SalesManager salesManager = new SalesManager(new BCampaignManager());
            Product product = new Product { Id = "1", Name = "GTA", Price = 300 };
            salesManager.Sell(gamer, product);
        }
    }
}
