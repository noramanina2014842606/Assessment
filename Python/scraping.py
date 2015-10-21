import urllib
import re
from bs4 import BeautifulSoup

url = "http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html/"

page = urllib.urlopen(url).read()
soup = BeautifulSoup(page)

for tr in soup.find_all('tr')[2:]:
    tds = tr.find_all('td')
    print "Name: %s, Position: %s, " % \
          (tds[0].text, tds[1].text)




