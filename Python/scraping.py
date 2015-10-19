import requests
import urllib2
from bs4 import BeautifulSoup

url ="http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html/"
r = requests.get(url)

soup = BeautifulSoup(r.content)

links = soup.find_all("a")


g_data = soup.find_all("table", {"id": "mytable"})
for item in g_data:
        print ("INFORMATION" + item.text)




