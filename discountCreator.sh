# Uses https://httpie.io/
http POST 'http://localhost:8081/discounts/' 'name=PROMO12' 'amount=20' 'enterprise=ALBACETEBANK' 'type=VALUE'
http POST 'http://localhost:8081/discounts?seconds=2000' 'name=PROMO35' 'amount=10' 'enterprise=MERCADONO' 'type=PERCENT'
http GET 'http://localhost:8081/discounts/consume/PROMO12'
http GET 'http://localhost:8081/discounts/consume/PROMO35'
http GET 'http://localhost:8081/discounts/VALUE'
http GET 'http://localhost:8081/discounts/PERCENT'