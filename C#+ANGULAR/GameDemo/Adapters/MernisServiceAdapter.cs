using GameDemo.Abstract;
using GameDemo.Entities;
using MernisServiceReference;
using System;
using System.Globalization;
using System.Collections.Generic;
using System.Text;

namespace GameDemo.Adapters
{
    public class MernisServiceAdapter : IGamerCheckService
    {
        public bool CheckIfRealPerson(Gamer gamer)
        {
            KPSPublicSoapClient client = new KPSPublicSoapClient(KPSPublicSoapClient.EndpointConfiguration.KPSPublicSoap);

            return client.TCKimlikNoDogrulaAsync(new TCKimlikNoDogrulaRequest(new TCKimlikNoDogrulaRequestBody(gamer.NationalityId, gamer.FirstName.ToUpper(new CultureInfo("tr-TR", false)), gamer.LastName.ToUpper(new CultureInfo("tr-TR", false)), gamer.DateOfBirth.Year))).Result.Body.TCKimlikNoDogrulaResult;
        }
    }
}
