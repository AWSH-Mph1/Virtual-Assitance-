import json
import urllib3


def lambda_handler(event, context):
    # TODO implement
    http = urllib3.PoolManager()
    r = http.request('GET', 'http://passportimageuploadapp-env.eba-gdtucx3x.us-east-1.elasticbeanstalk.com/getbyId/2')
    response=json.loads((r.data))
    print('reponse '+response['surname'])
    return {
        'statusCode': 200,
        'body': 'Thanks for providing details  '+response['name']+' '+response['surname']+' ! do you want to show flight options for you?'
    }
