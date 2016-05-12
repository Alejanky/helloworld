import paho.mqtt.client as mqtt
import datetime
import os

now=datetime.datetime.now()

def on_connect(client, userdate, flags, rc):
	print('Connected with result code '+str(rc))
	client.subscribe('poi')
def on_message(client, userdate, msg):
	print(msg.topic+' '+str(msg.payload))
	client.publish('poi','eres un pendejo')
	os.system('java sendmail %s %s'%(now.hour,now.minute))
	return



client=mqtt.Client()
client.on_connect=on_connect
client.on_message=on_message
client.connect('test.mosquitto.org',1883,60)

client.loop_forever()
