using GameDemo.Abstract;
using System;
using System.Collections.Generic;
using System.Text;

namespace GameDemo.Entities
{
    public class Product : Entity
    {
        public string Id { get; set; }
        public string Name { get; set; }
        public double Price { get; set; }
    }
}
