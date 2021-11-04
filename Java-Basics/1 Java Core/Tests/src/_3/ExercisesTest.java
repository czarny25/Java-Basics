package _3;

import java.util.HashMap;
import java.util.Map;

public class ExercisesTest {

	public static void addExercisesNamesPack(){
		
		
		//System.out.println("Add " + exerciseName + " to database");
		
		String [] bodyParts = {"CHEST", "BACK", "SHOULDERS", "LEGS", "CALVES", "BICEPS", "TRICEPS", "ABS" };
		

		
		String[][]exercsesNames = {{"Barbell Bench Press", "Dumbbell Bench Press", "Incline Bench Press", "Reverse Grip Incline Bench Press", "Incline Dumbbell Bench Press",
									"Decline Bench Press", "Decline Dumbbell Bench Press", "Dumbbell Flys", "Incline Dumbbell Flys","Decline Dumbbell Flys","Pec Dec",
									"Palms In Dumbbell Bench Press", "Palms In Incline Dumbbell Bench Press", "Barbell Pullover", "Dumbbell Pullover", "Chest Dip",
									"Cable Crossovers (standing straight up)", "Smith Machine Bench Press","Dumbbell Floor Press"},
								   {"Wide Grip Pull Up", "Bent Over Row", "Bent Over Dumbbell Row", "One Arm Dumbbell Row", "Close Grip Bent Over Row", "Seated Cable Row",
									 "Lat Pull Down", "Reverse Grip Lat Pull Down", "Behind Neck Lat Pull Down", "Reverse Grip Incline Bench Barbell Row", "Good Mornings",
									 "Deadlift", "HalfDeadlift", "Stiff Leg Deadlift On Bench", "Barbell Shrug", "Dumbbell Shrug"},                                                              
								   {"Back Barbell Press", "Barbell Press Behind Neck", "Seated Barbell Press Behind Neck", "Standing Dumbbell Press", "Seated Dumbbell Press",
									 "Military Press", "Arnold Press", "Dumbbell Lateral Raise", "Bent Over Dumbbell Reverse Fly", "Rear Delt Barbell Row To Neck",
									 "Barbell Upright Row", "Rear Delt Dumbbell Row To Neck", "Barbell Front Raise", "Dumbbell Front Raise", "Cable Front Raise",
									 "Cable Lateral Raise", "Cable Reverse Fly"}, 
								   {"Deep Squat", "Dumbbell Squat", "Front Squat", "Hack Squat", "Narrow Hack Squat", "Leg Extension", "Leg Curl", "Barbell Lunge",
									 "Dumbbell Lunge", "Dumbbell Step Up", "Standing Cable Hamstring Curl", "Stiff Leg Deadlift On Bench", "Dumbbell Stiff Leg Deadlift"}, 
								   {"Standing Barbell Calf Raise", "Seated Calf Raise", "Seated Calf Raise", "Seated Dumbbell Calf Raise", "Hack Calf Raise",
									 "Standing One Leg Calf Raise With Dumbbell"}, 
								   {"Standing Barbell Curl", "Standing Dumbbell Curl", "Standing Hammer Curl", "EZ Bar Preacher Curl", "One Arm Dumbbell Preacher Curl",
									 "Seated Hammer Curl", "Incline Dumbbell Curl", "Concentration Curl", "Cable Curl"}, 
								   {"Cable Tricep Extension", "Seated French Press", "One Arm Seated Dumbbell", "One Arm Seated Dumbbell", "Two Arm Seated Dumbbell",
									 "French Press/EZ Bar Skullcrushe", "Lying Dumbbell Extension", "One Arm Bent Over Dumbbell Kickback/Dumbbell Tricep Kickback",
									 "Cable Tricep Extension With Rope", "Tricep Dips", "Bench Dips", "Close Grip Incline Bench Press", "Close Grip Bench Press"}, 
				                   
								   {"Sit up", "Dumbbell Side Bends", "Lying Floor Leg Raise"}};
		
		Map <String,String[]> exerciseNames = new HashMap<String, String[]>();
		
		for(int i = 0; i < bodyParts.length; i++){				
			
			String name = bodyParts[i];
			String[] exercises = exercsesNames[i];
			
			exerciseNames.put(name, exercises);
			
			for(int j = 0; j < exercises.length; j++);
			
				//System.out.println(name + "  ---  " + exercises[j]);
			
			
			
			
		}
		
		
		System.out.println(exerciseNames.toString());

			
	}

	
	
	public static void main(String[] args) {
		
		addExercisesNamesPack();
	}
}
