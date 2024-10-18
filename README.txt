< 단방향 소통 >
	Service01  -----restTemplate----->  Service02
	Service01  <------응답 데이터------  Service02		
	
[ Service01 ]
	|-> Service01Application.java
	|	|-> @Bean
	|	    @LoadBalanced
	|	     RestTemplate restTemplate() {
	|		return new RestTemplate();
	|	     }
	|
	|-> Controller
		|-> @Autowired
		|    RestTemplate rt
		|
		|-> "http://Service02/lion" ---> Eureka에 등록되어있어서 가능한 것임
