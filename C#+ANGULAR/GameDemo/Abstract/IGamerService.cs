using System;
using System.Collections.Generic;
using System.Text;
using GameDemo.Entities;

namespace GameDemo.Abstract
{
    public interface IGamerService
    {
        void Save(Gamer gamer);
        void Update(Gamer gamer);
        void Delete(Gamer gamer);
    }
}
