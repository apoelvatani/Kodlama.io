using System;
using System.Collections.Generic;
using System.Text;
using GameDemo.Abstract;
using GameDemo.Entities;

namespace GameDemo.Concrete
{
    class GamerManager : IGamerService
    {
        IGamerCheckService _gamerCheckService;

        public GamerManager(IGamerCheckService gamerCheckService)
        {
            _gamerCheckService = gamerCheckService;
        }

        public void Delete(Gamer gamer)
        {
            Console.WriteLine(gamer.FirstName + "is deleted from game!");
        }

        public void Save(Gamer gamer)
        {
            if(_gamerCheckService.CheckIfRealPerson(gamer))
            {
                Console.WriteLine(gamer.FirstName + " is saved to game!");
            }
            else
                Console.WriteLine("Not a valid person!");
            
        }

        public void Update(Gamer gamer)
        {
            Console.WriteLine(gamer.FirstName + "is uptaded for game!");
        }
    }
}
