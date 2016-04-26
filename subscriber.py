import paho.mqtt.client as mqtt
def on_connect(client, userdate, flags, rc):
	print('Connected with result code '+str(rc))
	client.subscribe('poi')
def on_message(client, userdate, msg):
	print(msg.topic+' '+str(msg.payload))
	will_set('poi', 'Hola', 0, False)





client=mqtt.Client()
client.on_connect=on_connect
client.on_message=on_message
client.connect('test.mosquitto.org',1883,60)

client.loop_forever()
