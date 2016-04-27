from time import gmtime, strftime
import time
import pyupm_grove as grove
import pyupm_buzzer as upmBuzzer
button = grove.GroveButton(6)
button2= grove.GroveButton(7)
buzzer = upmBuzzer.Buzzer(5)
while 1:
	if button.value()==1:
		print button.name(), ' value is ', button.value()
		chords =upmBuzzer.DO
		buzzer.playSound(chords, 100000)
		time.sleep(1)
	if button2.value()!=0:
		print 'esto es de que hay alguien'
		time.sleep(1)	
del button
del button2
del buzzer 
del chords
