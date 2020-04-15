import json
import urllib3

def lambda_handler(event, context):
    # TODO implement
    http = urllib3.PoolManager()
    r = http.request('GET', 'http://passportimageuploadapp-env.eba-gdtucx3x.us-east-1.elasticbeanstalk.com/getavaliblefightInfo/BOM/TPA')
    response=json.loads(r.data)
    print('reponse1'+response['borading'])
    return {
        'statusCode': 200,
        'body': response
    }
